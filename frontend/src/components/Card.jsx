import classes from './Card.module.css'

const priorities = [1, 10, 100]

export function Card(props) {
    return (
        <div className={classes.card}>
            <div className={classes.cardDetails}>
                <p className={classes.textTitle}>{props.name}</p>
                <p className={classes.cardDetails}>{props.description}</p>
            </div>
            <button className={classes.cardButton}>More info</button>
        </div>
    );
}
