// import  Axios  from "axios"
// import { useState } from "react"
// import { useNavigate } from "react-router-dom"

// export const Login=()=>{

//     const [email,setEmail]=useState("")
//     const [password,setPassword]=useState("")

//     const navigate=useNavigate()

//     function authUser(){
//         Axios.post("http://127.0.0.1:4000/login",{email,password}).then((response)=>
//         { 
//            //console.log(response.data)

//            if(response.data==true){
//             navigate("/welcome")
//            }

//         }).catch((error)=>
//         {
//           console.error(error)
//         })
//     }

//     return(
//         <>
//         <input placeholder="Enter email" type="email" value={email} onChange={(e)=>setEmail(e.target.value)}/>
//         <input placeholder="Enter password" type="password" value={password} onChange={(e)=>setPassword(e.target.value)} />
//         <button onClick={authUser}>Login</button>
//         </>
//     )
// }







import axios from "axios"
import { useState } from "react"
import { useNavigate } from "react-router-dom"

export const Login=()=>
{
    const[email,setEmail]=useState("")
    const[password,setPassword]=useState("")
    const navigate=useNavigate()


    function authUser()
    {
        axios.post("http://localhost:4000/login",{email,password}).then((response)=>
        {
            //console.log(response.data)
            if(response.data==true)
            {
                navigate("/Welcome")
            }
        }).catch((err)=>
        {
            console.error(err)
        })
    }
    return(
        <>
        <input placeholder="Enter Email" type="email" value={email} onChange={e=>setEmail(e.target.value)}/>
        <input placeholder="Enter password" type="password" value={password} onChange={e=>setPassword(e.target.value)}/>

        <button onClick={authUser}>Login</button>
        </>
    )
}