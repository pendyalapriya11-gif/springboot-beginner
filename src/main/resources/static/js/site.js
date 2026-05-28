console.log("Hello from JS");
const users = [
    {
        name: "John",
        gender: "Male",
        img: "img/image-john.png"
    },
    {
        name: "Jane",
        gender: "Female",
        img: "img/image-jane.png"
    }
];
var currentUserIndex = 0;

function toggleCard() {
    currentUserIndex = (currentUserIndex+1)%2;
    var user = users[currentUserIndex];
    displayUser(user);
}
function displayUser(user) {
    console.log(user);
    document.getElementById("userImage").src = user.img;
    document.getElementById("userGender").innerHTML = user.gender;
    document.getElementById("userName").innerHTML = user.name;
}