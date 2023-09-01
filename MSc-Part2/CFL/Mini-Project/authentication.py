import requests
from requests.auth import HTTPBasicAuth

# HTTPBin URL for testing
url = "https://httpbin.org/basic-auth/username/password"

# Replace 'username' and 'password' with your desired credentials
username = "your_username"
password = "your_password"

# Make a GET request with basic authentication
response = requests.get(url, auth=HTTPBasicAuth(username, password))

# Check the response
if response.status_code == 200:
    print("Request successful!")
    print(response.text)
else:
    print("Request failed with status code:", response.status_code)
