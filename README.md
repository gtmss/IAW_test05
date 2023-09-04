# IAW_test05
Create a program that will analyze specified directory files recursively. Program algorithm should save information about files that satisfy conditions.

Conditions are stored in file named “conditions.json”. Example of conditions files can look like this (may
differ from this example):
{
"conditions":{
"extension":[pdf",txt",png"],
"days since its creation":[30",more"],
"days since last access":[15",less"]}}

Information about files, which should be saved, are stored in another file,
“necessary_information.json”. Example of it can look like this(may differ from this example):
named

{
" necessary_information":[
"file name",
"last access date",
"author name",
"file path",]}

Files with conditions and necessary information must be read and analyzed by program.
As a result, program must output a new created file, which contains information indicated in
“necessary_information.json”, about all files were found and satisfied conditions listed in “conditions.json”.
Format, extension and syntax of output file is absolutely up to you.
