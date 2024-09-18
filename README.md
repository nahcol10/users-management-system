User Management System

A full-stack user management application that features role-based access control. Built with React on the frontend and Spring Boot on the backend, it supports both admin and user roles. Admins have the ability to add, edit users and view their profile, while regular users are limited to viewing their profile and logging out.
Features
Admin

    Create New Users: Admin can add new users with specific roles.
    Edit User Information: Admin can update user information.
    View User Profiles: Admin can view all users' profiles.

User

    View Profile: Users can view their own profile.
    Logout: Users can securely log out.

Authentication & Authorization

    JWT-based Authentication: Secure login using JSON Web Tokens (JWT).
    Spring Security: Role-based access control (Admin and User roles).
    Password Hashing: User passwords are securely stored using BCrypt hashing.

Technologies Used
Frontend: React

    React: For building the user interface.
    Axios/Fetch: For handling HTTP requests to the backend.
    React Router: For client-side routing and navigation.
    Tailwind CSS: For styling the frontend (optional, you can use any CSS framework).

Backend: Spring Boot

    Spring Boot: For building the RESTful backend.
    Spring Security: For role-based authentication and authorization.
    JWT: For secure authentication with tokens.
    MySQL: For database storage (choose one based on your preference).
    Hibernate: For managing JPA repositories and database access.

Prerequisites

    Java 11 or later installed.
    Node.js and npm installed for React frontend.
    MySQL or MongoDB database set up.
    Maven for building the Spring Boot backend.
