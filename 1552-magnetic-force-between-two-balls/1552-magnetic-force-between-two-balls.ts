function maxDistance(position: number[], m: number): number {
    position.sort((a, b) => a - b);

    const isPossible = (minForce: number): boolean => {
        let count = 1;
        let lastPosition = position[0];

        for (let i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minForce) {
                count++;
                lastPosition = position[i];
            }
            if (count >= m) return true;
        }

        return false;
    };

    let left = 1;
    let right = position[position.length - 1] - position[0];
    let result = 0;

    while (left <= right) {
        const mid = Math.floor((left + right) / 2);

        if (isPossible(mid)) {
            result = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return result;
}