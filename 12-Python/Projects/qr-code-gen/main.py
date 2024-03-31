# Import the required libraries
import pyqrcode  # Library for creating QR codes
import png  # Library for saving QR codes as PNG images

# Prompt the user to enter a URL
url = input("Enter the URL: ")

# Create a QR code object for the provided URL
qr = pyqrcode.create(url)

# Save the QR code as a PNG image named "qr.png" with a specified scale
qr.png("qr.png", scale=8)

