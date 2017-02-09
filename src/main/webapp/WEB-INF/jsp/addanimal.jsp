<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>F R E E D A N K M E M S</title>
    <style>
        body {
            background: url(https://media.giphy.com/media/rXGRKiKEvg4Ba/giphy.gif) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }

        option {
            align-content: center;
        }

        input {
            display: block;
            position: relative;
            align-content: center;
        }
    </style>

</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="http://localhost:8080">AnimalKingdom</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="http://localhost:8080/test">test</a></li>
            <li><a href="http://localhost:8080/overview">All animals</a></li>
            <li><a href="http://localhost:8080/humans">All humans</a></li>
            <li><a href="http://localhost:8080/cageoverview">All cages</a></li>
            <li><a href="http://localhost:8080/animalsNoHuman">All animals(no humans)</a></li>
            <li><a href="http://localhost:8080/addanimal">Adding Animals</a></li>
            <li><a href="http://localhost:8080/marry">Marry</a></li>
        </ul>
    </div>
</nav>

<form action="addanimal" method="post">

    Race: <select name="Race">
    <optgroup label="Mammals">
        <option value="African Elephant">African Elephant</option>
        <option value="Asian Elephant">Asian Elephant</option>
        <option value="Gray Mouse">Gray Mouse</option>
        <option value="Human" name="Human">Human</option>
        <option value="Platypus">Platypus</option>
        <option value="White Mouse" name="White Mouse">White Mouse</option>
    </optgroup>
    <optgroup label="Birds">
        <option value="Parrot" name="Parrot">Parrot</option>
        <option value="Pinguin" name="Pinguin">Pinguin</option>
    </optgroup>
    <optgroup label="Reptiles">
        <option value="Crocodile">Crocodile</option>
        <option value="Snake">Snake</option>
    </optgroup>
</select>


    </select>
    <h1></h1>
    Gender
    <select name="Gender">
        <option value="Male" name="Male"> Male</option>
        <option value="Female" name="Female"> Female</option>
    </select>
    <h1></h1>
    Name: <input required type="text" name="FirstName" id="FirstName" placeholder="Name"><br>
    Body covering: <input required type="text" name="BodyCovering" id="BodyCovering" placeholder="Body covering"><br>
    Color: <input required type="text" name="Color" id="Color" placeholder="Color"><br>
    Weight: <input required type="text" name="Weight" id="Weight" placeholder="Weight"><br>
    Max number of eggs: <input required type="text" name="MaxNumberOfEggs" id="MaxNumberOfEggs"
                               placeholder="Max number of Eggs"><br>
    Insertion: <input type="text" name="Insertion" id="Insertion" placeholder="Insertion (Humans only)"><br>
    Last Name: <input type="text" name="LastName" id="LastName" placeholder="Last Name (Humans only)"><br>
    Ear Size: <input type="text" name="EarSize" id="EarSize" placeholder="Ear Size (Elephants only)"><br>
    <button type="submit" value="Submit">Create Animal</button>
</form>


<footer>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</footer>
</body>
</html>
