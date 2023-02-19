import {Card} from "../../components/Card.jsx";
import classes from "./CourseList.module.css";


export function CourseList() {
    const courses = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
    const result = []
    courses.forEach((item, i) => {
        result.push(<Card name="title" description="description" image={i}/>)
    });
    return (<div className={classes.listBody}>{result}</div>)
}