`if(window.attachEvent) {
    window.attachEvent('onload', yourFunctionName);
} else {
    if(window.onload) {
        var curronload = window.onload;
        var newonload = function() {
            curronload();
            yourFunctionName();
        };
        window.onload = newonload;
    } else {
        window.onload = hello;
    }
}`

hello = -> console.log 'coffee works.'