type Partida = {
    timeA: string;
    timeB: string;
    resultado: {
        golsTimeA: number;
        golsTimeB: number;
    };
};

function calcularClassificacao(partidas: Partida[]): { time: string; pontos: number }[] {
    const tabela: { [key: string]: number } = {};

    partidas.forEach(partida => {
        const { timeA, timeB, resultado } = partida;

        if (!tabela[timeA]) tabela[timeA] = 0;
        if (!tabela[timeB]) tabela[timeB] = 0;

        if (resultado.golsTimeA > resultado.golsTimeB) {
            tabela[timeA] += 3; // Vitória Time A
        } else if (resultado.golsTimeA < resultado.golsTimeB) {
            tabela[timeB] += 3; // Vitória Time B
        } else {
            tabela[timeA] += 1; // Empate
            tabela[timeB] += 1; // Empate
        }
    });

    return tabela;
}

const partidas: Partida[] = [
    { timeA: "Time 1", timeB: "Time 2", resultado: { golsTimeA: 2, golsTimeB: 1 } },
    { timeA: "Time 3", timeB: "Time 4", resultado: { golsTimeA: 0, golsTimeB: 0 } },
    { timeA: "Time 1", timeB: "Time 3", resultado: { golsTimeA: 3, golsTimeB: 1 } },
    { timeA: "Time 2", timeB: "Time 4", resultado: { golsTimeA: 2, golsTimeB: 2 } },
    { timeA: "Time 1", timeB: "Time 4", resultado: { golsTimeA: 0, golsTimeB: 1 } },
    { timeA: "Time 2", timeB: "Time 3", resultado: { golsTimeA: 1, golsTimeB: 3 } }
];

console.log(calcularClassificacao(partidas));