set -e
grep -l "base pair" technical/biomed/* > count-keyword-output.txt
wc count-keyword-output.txt