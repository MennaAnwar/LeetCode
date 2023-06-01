class EventEmitter {
  subscriptions = {};
  subscribe(event, cb) {
    this.subscriptions[event] = this.subscriptions[event] || [];
    const index = this.subscriptions[event].push(cb);
    return {
        unsubscribe: () => {
           this.subscriptions[event].splice(index-1,1);
        }
    };
  }

  emit(event, args = []) {
    if(!this.subscriptions[event]) return [];
    return this.subscriptions[event].map(ev=>ev(...args));
  }
}


/**
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */