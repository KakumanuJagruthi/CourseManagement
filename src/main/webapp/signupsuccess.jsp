<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up Success</title>
    <style>
        /* CSS from signup page */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            max-width: 100%;
            padding: 20px;
            text-align: center;
        }
        h1 {
            color: #4CAF50;
        }
        p {
            font-size: 16px;
            color: #333;
            margin-bottom: 20px;
        }
        .btn {
            display: inline-block;
            background-color: #4CAF50;
            color: #fff;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
        }
        .btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Sign-Up Successful!</h1>
        <p>Thank you, {educator.name} for registering as an educator. Your account has been successfully created.</p>
        <a href="/educatorlogin" class="btn">Please Login Again</a>
    </div>
</body>
</html>
