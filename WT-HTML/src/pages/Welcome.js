// import axios from "axios"
// import { useCallback, useEffect, useState } from "react"

// export const Welcome = () => {

//     const [users, setUsers] = useState([])

//     // const fectchData = useCallback(() =>
//     //  {
//     //     axios.get("http://localhost:4000/getusers").then((response) =>
//     //      {
//     //         setUsers(response.data)
//     //     }).catch(error)=>{
//     //         console.error(error)
//     //      }
//     // })

    

//     // useEffect(() => {
//     //     fectchData()

//     // }, [fectchData])




//     const fetchData=useCallback(()=>
//     {
//         axios.get("http://localhost:4000/getusers").then((response)=>
//         {
//             setUsers(response.data)
//         }).catch((error)=>
//         {
//             console.error(error)
//         })
//     })

//     useEffect(()=>
//     {
//         fetchData()
//     },[fetchData])

//     return (
//         <>
//             <h1>Welcome User</h1>
//             <table>
//                 <tr>
//                     <th>Name</th>
//                     <th>Age</th>
//                     <th>Mobile</th>
//                     <th>Email-id</th>
//                     <th>Actions</th>
//                 </tr>
//                 {users.map(() => {
//                     return (
//                         <>
//                             <tr>
//                                 <td>{u.name}</td>
//                                 <td>{u.age}</td>
//                                 <td>{u.mobile}</td>
//                                 <td>{u.email}</td>
//                                 <td>
//                                     <button>Update</button>
//                                     <button>Delete</button>
//                                 </td>
//                             </tr>
//                         </>
//                     )
//                 })}
//             </table>
//         </>
//     )
// }






import { useCallback, useEffect, useState } from "react"
import axios from "axios"
import { useNavigate } from "react-router-dom"

export const Welcome=()=>
{
    const navigate=useNavigate()
    const [users,setUsers]=useState([])
    
    const fetchData=useCallback(()=>
    {
        axios.get("http://localhost:4000/getusers").then((response)=>
        {
            setUsers(response.data)
        }).catch((error)=>
        {
            console.error(error)
        })
    },[])

    useEffect(()=>
    {
        fetchData()
    },[fetchData])


    function updateUser(user){
        navigate("/update",{state:{user:user}})
    }

    function deleteUser(user){

        axios.post("http://localhost:4000/deleteuser",
        {id:user.id}).then((response)=>{

            console.log(response.data)
            
        }).catch((err)=>{
            console.error(err)
        })


    }




    return(
        <>
        <h1>Welcome User</h1>

        <table>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Mobile</th>
                <th>Email-id</th>
                <th>Actions</th>
            
            </tr>
            {users.map((u)=>
            {
                return(
                    <>
                    <tr>
                        <td key={u.id}>{1}</td>
                        <td>{u.name}</td>
                        <td>{u.age}</td>
                        <td>{u.mobile}</td>
                        <td>{u.email}</td>
                        <td>
                            <button onClick={()=>updateUser(u)}>Update</button>
                            <button onClick={()=>deleteUser(u)}>Delete</button>
                        </td>
                    </tr>
                    </>
                )
            })}
        </table>

        
        </>
    )
}