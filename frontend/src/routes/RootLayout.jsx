import {Outlet} from "react-router-dom";
import Menu from "./Menu/Menu.jsx";
import Header from "./Header/Header.jsx";
import styles from './RootLayout.module.css';


function RootLayout() {
    return (
        <>
            <Menu/>
            <Header/>
            <div className={styles.outlet}><Outlet/></div>
        </>
    )

}

export default RootLayout