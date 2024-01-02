import axios from "axios"
import { useEffect, useState } from "react"
import { useLocation, useNavigate } from "react-router-dom"

export const Update=()=>
{

  const [name,setName]=useState("")
  const [age,setAge]=useState("")
  const [mobile,setMobile]=useState("")
  const [email,setEmail]=useState("")

  const navigate =useNavigate()
  const params=useLocation()

  console.log(params.state.user)

  let user=params.state.user

  const [failed,setFailed] = useState(false);

  useEffect(()=>{
    setName(user.name)
    setAge(user.age)
    setMobile(user.mobile)
    setEmail(user.email)
  },[]);
 
  function updateUser()
  {
     
      axios.post("http://127.0.0.1:4000/update",{id:user.id,name,age,mobile,email}).then((response)=>
      { 

      //  console.log(response.data)
        
        if(response.data==true){
          setFailed(response.data);
          console.log(response.data)

          setTimeout(()=>{
            navigate("/welcome")
          },2000);
        }
        else{
          setFailed(response.data)
        }

      }).catch((error)=>
      {
        console.error(error)
      })

  }
  

    return(
      
      
       <div id="div1" >
             <div  style={
      {             alignitem:'center', 
                   backgroundColor:'red',
                   border: '1px solid',
                   margin: 'auto',
                   width: '20%',
                   padding: '10px'}}>

        <h3 >Update</h3>

        <input type="text" value={name} onChange={(e)=>setName(e.target.value)}  placeholder="Enter name"/><br/>
        <input type="number" value={age} onChange={(e)=>setAge(e.target.value)}  placeholder="Enter age" /><br/>
        <input type="tel" value={mobile} onChange={(e)=>setMobile(e.target.value)}  placeholder="Enter mobile no"/><br/>
        <input type="email" value={email} onChange={(e)=>setEmail(e.target.value)} placeholder="Enter email"/><br/>
        
        <button onClick={updateUser}>Update</button>
        

        </div>
        </div>
        )
}