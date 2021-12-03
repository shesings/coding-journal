# Read from the file file.txt and output all valid phone numbers to stdout.
# only valid format is: (xxx) xxx-xxxx or xxx-xxx-xxxx
#!/bin/bash
#while IFS = read -r line
#do
#    echo "$line"
grep -Po "(^(\d{3})-(\d{3})-(\d{4}$)|^[(](\d{3})[)]\s(\d{3})-(\d{4}$))" file.txt