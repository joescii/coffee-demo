(($) ->
  $ -> $('#get-time').click ->
    time = new Date
    msg = "Current time is #{time}"
    console.log msg
    $('#time').text msg
) jQuery