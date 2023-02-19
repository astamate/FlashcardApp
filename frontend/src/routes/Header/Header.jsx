import React, {useState} from 'react';
import {Link} from 'react-router-dom';
import styles from './Header.module.css';
import {FaUserCircle} from 'react-icons/all.js';

function Header() {
    const [isLogin, setLogin] = useState(false);
    const [open, setOpen] = React.useState(false);

    const handleOpen = () => {
        setOpen(!open);
    };

    const toggleMenu = () => {
        setLogin(!isLogin);
    };

    return (
        <div className={styles.header}>
            <button className={styles.profile} onClick={handleOpen}><FaUserCircle/></button>
            <div className={open ? styles.dropdown : styles.hidden}>
                <Link to="/login">
                    <button className={isLogin ? styles.hidden : null} onClick={handleOpen}>Log In</button>
                </Link>
                <Link to="/logout">
                    <button className={isLogin ? null : styles.hidden} onClick={handleOpen}>Settings</button>
                </Link>
                <Link to="/settings">
                    <button className={isLogin ? null : styles.hidden} onClick={handleOpen}>Log out</button>
                </Link>
            </div>
        </div>
    )
}

export default Header;