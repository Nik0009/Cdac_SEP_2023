import { BrowserRouter,Routes,Route} from "react-router-dom";
import {About} from "./pages/About"
import {Contact} from "./pages/Contact"
import {Services} from "./pages/Services"
import {Menu} from "./Menu"
import {Home} from "./pages/Home"
import { Register } from "./pages/Register";
import { Login } from "./pages/Login";
import { Welcome } from "./pages/Welcome";
import { Update } from "./pages/Update";


function App() {
  return (
    <BrowserRouter>
      <Routes>
            <Route path="/" element={<Menu/>}>
              <Route index element={<Home/>} />
              <Route path="about" element={<About/>} />
              <Route path="contact" element={<Contact/>} />
              <Route path="services" element={<Services/>} />
              <Route path="register" element={<Register/>} />
              <Route path="login" element={<Login/>} />
              <Route path="welcome" element={<Welcome/>} />
              <Route path="update" element={<Update/>} />
            </Route>
      </Routes>
    </BrowserRouter>
    
  );
}

export default App;
