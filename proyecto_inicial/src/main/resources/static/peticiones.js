  fetch("http://localhost:8080/juego/nuevo-juego")
  .then(response => response.json())
  .then(data => {
    // Mostrar solo el valor asociado a la clave "numero"
    document.getElementById("palabra_e").textContent = data.numero;
  })
  .catch(error => {
    console.error("Error:", error);
  });
