import {Link, Outlet} from "react-router-dom"

export const Menu=()=>{
    return(
        <>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="about">About</Link>
                    </li>
                    <li>
                        <Link to="services">Services</Link>
                    </li>
                    <li>
                        <Link to="contact">Contact</Link>
                    </li>
                    <li>
                        <Link to="register">Register</Link>
                    </li>
                    <li>
                        <Link to="login">Login</Link>
                    </li>
                </ul>
            </nav>

            <Outlet/>

        </>
    );
};