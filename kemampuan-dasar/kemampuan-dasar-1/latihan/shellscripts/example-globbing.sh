#!/bin/zsh

foo="a_string_with_a_message"
if [[ $foo = (a|an)_(#b)(*) ]]; then
  print ${foo[$mbegin[1],$mend[1]]};
fi
