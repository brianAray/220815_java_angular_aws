let banner = document.querySelector("#banner");

window.addEventListener("load", renderLogin)

function renderLogin(){
    let loginContainer = document.createElement("div");
    loginContainer.id = "login";

    let usernameInput = document.createElement("input");

    usernameInput.id = "username";
    let usernameLabel = document.createElement("p");
    usernameLabel.innerText = "Username";

    loginContainer.appendChild(usernameLabel);

    usernameInput.type = "text";
    usernameInput.placeholder = "username";

    loginContainer.appendChild(usernameInput);
    loginContainer.appendChild(document.createElement("br"));

    let passwordLabel = document.createElement("p");
    passwordLabel.innerText = "Password";

    loginContainer.appendChild(passwordLabel);

    let passwordInput = document.createElement("input");

    passwordInput.type = "password";
    passwordInput.id = "password";

    loginContainer.appendChild(passwordInput);
    loginContainer.appendChild(document.createElement("br"));

    let submitButton = document.createElement("input");

    submitButton.type = "button";
    submitButton.value = "submit";

    submitButton.addEventListener("click", asyncLogin);

    loginContainer.appendChild(submitButton);

    let resetButton = document.createElement("input");

    resetButton.type = "button";
    resetButton.value = "reset";

    resetButton.addEventListener("click", function(){
        usernameInput.value = "";
        passwordInput.value = "";
    });

    loginContainer.appendChild(resetButton);

    document.querySelector("body").appendChild(loginContainer);
}

function derenderPage(){
    document.querySelector("body").innerHTML = "";
}

function renderHomepage(data){
    derenderPage();
    let userbanner = document.createElement("h1");
    userbanner.innerText = data.username;

    document.querySelector("body").appendChild(userbanner);
}

async function asyncLogin(){
    let userInput = document.querySelector("#username").value;
    let passInput = document.querySelector("#password").value;

    const url = `http://localhost:8080/login`;

    let loginObj = {
        username: userInput,
        password: passInput
    };

    try{
        let response = await fetch(
            url,
            {
                method: "POST",
                headers: new Headers({
                    'content-type':'application/json'
                }),
                body: JSON.stringify(loginObj)}
        )

        let data = await response.json();
        console.log(data);
        renderHomepage(data);
    }catch(error){
        console.error(`Error is ${error}`);
    }
}