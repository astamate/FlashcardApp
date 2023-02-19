import styles from './NotFoundPage.module.css';
import Menu from "../Menu/Menu.jsx";

function NotFoundPage() {
    return (
        <div className={styles.view}>
            <div className={styles.container}>
                <h1 className={styles.heading}>404 - Page not found</h1>
                <p className={styles.message}>The requested page does not exist.</p>
            </div>
        </div>
    );
}

export default NotFoundPage;