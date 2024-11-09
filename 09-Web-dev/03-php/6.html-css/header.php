<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> <?php echo isset($title) ? $title : "Error While reading"; ?></title>
</head>
<body>
<header>
    <h1><?php echo isset($title) ? $title : "Error While reading  title"; ?></h1>

    <ul>
        <li class="nav-item <?php if($nav === "home"): ?>active <?php endif;?>  active">
            <a href="/6.html-css/contact.php"> Contact  </a>
        </li>
        <li>
            <a href="/6.html-css/main.php"> Home  </a>
        </li>
    </ul>
</header>

<style>
    header {
        background-color: #333;
        color: white;
        padding: 20px;
        text-align: center;
    }
</style>
