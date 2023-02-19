import React, {useState} from 'react';
import {Link} from 'react-router-dom';
import styles from './Menu.module.css';
import {AiFillGithub, AiFillLinkedin, GiHamburgerMenu} from 'react-icons/all.js';

function Menu() {
    const [showMenu, setShowMenu] = useState(false);

    const toggleMenu = () => {
        setShowMenu(!showMenu);
    };

    return (
        <div className={showMenu ? styles.sidenav : styles.burgerNav}>
            <div className={showMenu ? styles.hidden : styles.burger}>
                <div onClick={toggleMenu}><GiHamburgerMenu/></div>
            </div>

            <div className={showMenu ? styles.menu : styles.hidden}>
                <div className={styles.title} onClick={toggleMenu}>FlashCards App</div>
                <div className={styles.links}>
                    <Link to="/course" className={styles.link} onClick={toggleMenu}>
                        <button>Courses</button>
                    </Link>
                    <Link to="/practice" className={styles.link} onClick={toggleMenu}>
                        <button>Practice</button>
                    </Link>
                    <Link to="/stats" className={styles.link} onClick={toggleMenu}>
                        <button>Stats</button>
                    </Link>
                </div>
                <div>
                    <div className={styles.media}>
                        <a href="https://github.com/astamate/FlashcardApp" target="_blank"><AiFillGithub/></a>
                        <a href="https://www.linkedin.com/in/andrei-stamate/" target="_blank"><AiFillLinkedin/></a>
                    </div>
                    <div className={styles.footer}>©Andrei.S</div>
                </div>
            </div>
        </div>
    );
}

export default Menu;