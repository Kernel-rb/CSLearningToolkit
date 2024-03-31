from bs4 import BeautifulSoup

html = """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3><b id="boldest">Lebron James</b></h3>
    <p>Salary: $92,000,000</p>
    <h3><b>Stephen Curry</b></h3>
    <p>Salary: $85,000,000</p>
    <h3><b>Kevin Durant</b></h3>
    <p>Salary: $73,200,000</p>
</body>
</html>
"""

soup = BeautifulSoup(html, 'html.parser')
print(soup)