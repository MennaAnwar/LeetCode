function totalMoney(n: number): number {
    let res = 0;
    let week = 0;

    for (let i = 1; i <= n; i++) {
        if (i % 7 === 0) {
            res += 7 + week;
            week++;
            continue;
        }

        res += week + (i % 7);
    }

    return res;
};