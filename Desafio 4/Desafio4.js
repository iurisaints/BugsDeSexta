function verificarSextaFeira13(ano) {
    const mesesComSexta13 = [];
    const totalSexta13 = 0;
    const nomesDosMeses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];

    for (let mes = 0; mes < 12; mes++) {
        const data = new Date(ano, mes, 13);

        if (data.getDay() === 5) { // Verifica se é sexta-feira
            mesesComSexta13.push(nomesDosMeses[mes]);
            totalSexta13 += 1;
        }
    }

    return {
        mesesComSexta13: mesesComSexta13,
        totalSexta13: totalSexta13
    };
}

console.log(verificarSextaFeira13(2023));