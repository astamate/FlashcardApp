import React from 'react'
import ReactDOM from 'react-dom/client'
import {RouterProvider, createBrowserRouter} from "react-router-dom";
import './index.css'
import RootLayout from "./routes/RootLayout.jsx";
import Login from "./routes/Login/Login.jsx";
import {CourseList} from "./routes/CourseList/CourseList.jsx";
import NotFoundPage from "./routes/NotFoundPage/NotFoundPage.jsx";


const router = createBrowserRouter([
    {
        path: '/',
        element: <RootLayout/>,
        children: [
            {path: '/login', element: <Login/>},
            {path: '/', element: <Login/>},
            {path: '/course', element: <CourseList/>},
            {path: '*', element: <NotFoundPage/>},
        ],
    },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
        <RouterProvider
            router={router}
        />
    </React.StrictMode>
)
