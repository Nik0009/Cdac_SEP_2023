
// import axios from "axios"
// import { useState } from "react"

// export const Register =() =>{
//     const [name,setName]=useState("")
//     const [age,setAge]=useState("")
//     const [mobile,setMobile]=useState("")
//     const [email,setEmail]=useState("")
//     const [password,setPass]=useState("")

//     function saveUser(){
//         // axios is api/lib to use ajax in react
//         // ajaz is asynchromous javascript and xml


//         axios.post("http://127.0.0.1:4000/register",{name,age,mobile,email,password}).then((response)=>{
//             console.log(response.data)
//         }).catch((err)=>{
//             console.log(err)
//         })
//     }
    
//     return(
//         <>
//         <input type="text" value={name} onChange={(e)=>setName(e.target.value)} placeholder="Enter name"/><br/>
//         <input type="text" value={age} onChange={(e)=>setAge(e.target.value)} placeholder="Enter age"/><br/>
//         <input type="tel" value={mobile} onChange={(e)=>setMobile(e.target.value)} placeholder="Enter mobile"/><br/>
//         <input type="email" value={email} onChange={(e)=>setEmail(e.target.value)} placeholder="Enter Email"/><br/>
//         <input type="password" value={password} onChange={(e)=>setPass(e.target.value)} placeholder="Enter Password"/><br/>
//         <button onClick={saveUser} >Register</button>
//         </>
//     )
// }







import  Axios  from "axios"
import { useState } from "react"

export const Register=()=>
{

  const [name,setName]=useState("")
  const [age,setAge]=useState("")
  const [mobile,setMobile]=useState("")
  const [email,setEmail]=useState("")
  const [password,setPassword]=useState("")

 
  function saveUser()
  {
     //ajax is api/lib to use ajax in react
      Axios.post("http://127.0.0.1:4000/register",{name,age,mobile,email,password}).then((response)=>
      { 
         console.log(response.data)
      }).catch((error)=>
      {
        console.error(error)
      })

  }
  

    return(
      
      
      <div id="div1" >
            <div  style={{
                   alignitem:'center', 
                   backgroundColor:'red',
                   border: '1px solid',
                   margin: 'auto',
                   width: '20%',
                   padding: '10px'}}>
        <h3 >Register</h3>
        <input type="text" value={name} onChange={(e)=>setName(e.target.value)} id="name" placeholder="name"/><br/>
        <input type="number" value={age} onChange={(e)=>setAge(e.target.value)} id="age" placeholder="Enter age" /><br/>
        <input type="number" value={mobile} onChange={(e)=>setMobile(e.target.value)} id="mobile" placeholder="Enter mobile no"  /><br/>
        <input type="text" value={email} onChange={(e)=>setEmail(e.target.value)} id="email" placeholder="Enter email"/><br/>
        <input type="text" value={password} onChange={(e)=>setPassword(e.target.value)} id="password" placeholder="Enter password" /><br/><br/>
        <button onClick={saveUser}>Register</button>


        </div> 
       </div>
        )
}