<?php
$title = "Contact Page"; 
require "header.php";
?>

<main>
    <h2>Contactez-nous</h2>
    <p>Si vous avez des questions, n'hésitez pas à nous contacter via ce formulaire :</p>
    
    <form action="submit_form.php" method="POST">
        <label for="name">Nom :</label>
        <input type="text" id="name" name="name" required>

        <label for="email">E-mail :</label>
        <input type="email" id="email" name="email" required>

        <label for="message">Message :</label>
        <textarea id="message" name="message" rows="4" required></textarea>

        <button type="submit">Envoyer</button>
    </form>
</main>

<style>
    main {
        padding: 20px;
        background-color: #fff;
        margin-top: 20px;
        max-width: 800px;
        margin-left: auto;
        margin-right: auto;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    form {
        display: flex;
        flex-direction: column;
    }

    label {
        margin-bottom: 5px;
        font-weight: bold;
    }

    input, textarea {
        margin-bottom: 15px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    button {
        padding: 10px 15px;
        background-color: #333;
        color: white;
        border: none;

        border-radius: 5px;
        cursor: pointer;
    }

    button:hover {
        background-color: #555;
    }
</style>
<?php require "footer.php" ?>