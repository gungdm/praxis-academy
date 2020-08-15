#!/bin/zsh

a=5; b=32; c=24; (( a += (++a + b * c) - 2 ))
print $a;
