
document.addEventListener('DOMContentLoaded', () => {
  fetch('http://localhost:8080/professor')
    .then(response => response.json())
    .then(data => {
      const tbody = document.getElementById('professor-tbody');
      data.forEach(prof => {
        const tr = document.createElement('tr');

        tr.innerHTML = `
          <td>${prof.nome}</td>
          <td>${prof.email}</td>
          <td>${prof.telefone}</td>
        `;

        tbody.appendChild(tr);
      });
    })
    .catch(error => {
      console.error('Erro ao buscar professores:', error);
      alert('Erro ao carregar a lista de professores.');
    });
});