<%@page import="in.pentagon.studentapp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Pentagon Space - Update Account</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0ffff;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    .container {
      background-color: white;
      padding: 40px;
      border-radius: 10px;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
      width: 400px;
      text-align: left;
    }

    h1 {
      color: #002060;
      text-align: center;
      margin-bottom: 5px;
    }

    h2 {
      color: #2e75b6;
      text-align: center;
      margin-bottom: 30px;
    }

    label {
      display: block;
      margin: 10px 0 5px;
      font-weight: bold;
    }

    input[type="text"] {
      width: 100%;
      padding: 8px;
      margin-bottom: 15px;
      border-radius: 4px;
      border: 1px solid #ccc;
    }

    .buttons {
      display: flex;
      justify-content: space-between;
    }

    .buttons input {
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      color: white;
      font-weight: bold;
      cursor: pointer;
    }

    .update-btn {
      background-color: #4CAF50;
    }

    .back-btn {
      background-color: #007BFF;
    }

    .update-btn:hover {
      background-color: #45a049;
    }

    .back-btn:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Pentagon Space</h1>
    <h2>Update your account</h2>
    <form action="updateAccount" method="post">
    <% Student s=(Student)request.getAttribute("student"); %>
    <%if(s!=null){ %>
   <input type="hidden" name="id" value="<% s.getId();%>">
      <label for="name">Enter your Name:</label>
      <input type="text" name="name" id="name" required>

      <label for="phone">Enter the Phone number:</label>
      <input type="text" name="phone" id="phone" required>

      <label for="mail">Enter the Mail ID:</label>
      <input type="text" name="mail" id="mail" required>

      <label for="branch">Enter the Branch:</label>
      <input type="text" name="branch" id="branch" required>

      <label for="location">Enter the Location:</label>
      <input type="text" name="location" id="location" required>

      <div class="buttons">
        <input type="submit" value="updateAccount" class="update-btn">
        <input type="button" value="Back" class="back-btn" >
      </div>
    </form>
    <%} %>
  </div>
</body>
</html>
