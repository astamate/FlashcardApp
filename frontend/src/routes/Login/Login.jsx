import React, {useState} from 'react';
import styles from './Login.module.css'

export function Login() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
    };

    return (
        <div className={styles.container}>
            <h1>Login</h1>
            <form onSubmit={handleSubmit}>
                <label>
                    Username:
                    <input type="text" value={username} onChange={(event) => setUsername(event.target.value)}/>
                </label>
                <br/>
                <label>
                    Password:
                    <input type="password" value={password} onChange={(event) => setPassword(event.target.value)}/>
                </label>
                <br/>
                <button type="submit" className={styles.button}>Log in</button>
            </form>
        </div>
    );
}

export default Login;