//Obtener nombre de usuario o email para colocarlo cuando este logeado

document.addEventListener("DOMContentLoaded", () => {
    const usuario = localStorage.getItem("usuario");
    if (usuario){
        document.getElementById("mensajeBienvenida").textContent = `Bienvenido, ${usuario}`;
    }
})