function timeRequiredToBuy(tickets: number[], k: number): number {
    let time: number = 0;
    for (let i: number = 0; true; i = i === tickets.length ? 0 : i + 1) {
        if (tickets[i] > 0) {
            tickets[i]--;
            time++;
            if (tickets[i] === 0 && i === k) {
                break;
            }
        }
    }
    return time;
};