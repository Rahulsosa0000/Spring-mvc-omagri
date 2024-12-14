<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
        }
        .container {
            max-width: 400px;
            padding: 20px;
            background-color: #fff;
            margin: 50px auto;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
        }
        .container h2 {
            text-align: center;
        }
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            display: block;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: white;
            padding: 15px;
            border: none;
            width: 100%;
            font-weight: bold;
            cursor: pointer;
            border-radius: 5px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Registration Form</h2>
    <form action="register" method="post">
        <!-- Email Field -->
        <label for="email">Email</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" required>

        <!-- Name Field -->
        <label for="name">Full Name</label>
        <input type="text" id="name" name="name" placeholder="Enter your name" required>

        <!-- Password Field -->
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <!-- Submit Button -->
        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>
