// Generated by CoffeeScript 1.8.0
(function() {
  (function($) {
    return $(function() {
      return $('#get-time').click(function() {
        var msg, time;
        time = new Date;
        msg = "Current time is " + time;
        console.log(msg);
        return $('#time').text(msg);
      });
    });
  })(jQuery);

}).call(this);

//# sourceMappingURL=time.js.map