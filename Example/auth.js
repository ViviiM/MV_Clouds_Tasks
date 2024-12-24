// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/11.1.0/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/11.1.0/firebase-analytics.js";

import { getAuth, createUserWithEmailAndPassword, signInWithEmailAndPassword, signOut, sendPasswordResetEmail } from "https://www.gstatic.com/firebasejs/11.1.0/firebase-auth.js";

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyBTKDm-zYs8Wiu_C4OmgN9fj1byZykznuI",
    authDomain: "auth-19e87.firebaseapp.com",
    projectId: "auth-19e87",
    storageBucket: "auth-19e87.firebasestorage.app",
    messagingSenderId: "248251884189",
    appId: "1:248251884189:web:53117c2ffceef242346a74",
    measurementId: "G-NN33BGZX95"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);

const check = document.getElementById('submit');
console.log(check);
if (check != null) {
    check.addEventListener('click',
        function signin(e) {
            e.preventDefault();
            console.log("Started");
            // alert(1)
            //inputs
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;
            signInWithEmailAndPassword(auth, email, password)
                .then((userCredential) => {
                    // Signed up 
                    const user = userCredential.user;
                    console.log(user);
                    localStorage.setItem("accesstoken", user.accessToken);
                    localStorage.setItem("email", user.email)
                    window.location.href = `index.html?email=${user.email}`
                    alert("Creating...")
                    // ...
                })
                .catch((error) => {
                    const errorCode = error.code;
                    const errorMessage = error.message;
                    alert("Err" + errorMessage)
                    // ..
                });
        });
} else {
    console.log('nodata');
}

const create = document.getElementById('createnew');
console.log(create);
if (create != null) {
    create.addEventListener('click', function signup(e) {
        e.preventDefault();
        console.log("Creating");
        const email = document.getElementById("newemail").value;
        const password = document.getElementById('newpassword').value;
        createUserWithEmailAndPassword(auth, email, password)
            .then((userCredential) => {
                // Signed up 
                const user = userCredential.user;
                localStorage.setItem("accesstoken", user.accessToken);
                localStorage.setItem("email", user.email)
                window.location.href = `payment.html`
                alert("Created New Account")
                // ...
            })
            .catch((error) => {
                const errorCode = error.code;
                const errorMessage = error.message;
                // ..
                alert("Error" + errorMessage)
            });
    })
} else {
    console.log("No data");
}



const reset = document.getElementById('forgot');
reset.addEventListener('click', (e) => {
    e.preventDefault();
    const email = document.getElementById("email").value;
    sendPasswordResetEmail(auth, email)
        .then(() => {
            alert("Password Reset Send to your Email");
        })
        .catch((error) => {
            const errorCode = error.code;
            const errorMessage = error.message;
            // ..
            alert("error "+ errorMessage)
        });


})