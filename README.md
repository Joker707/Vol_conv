# Volume_converter

**CI for 'master' branch**  
[![CI master](https://github.com/Joker707/Vol_conv/blob/develop/.github/workflows/maven.yml/badge.svg?branch=master)](https://github.com/Joker707/Vol_conv/blob/develop/.github/workflows/maven.yml)    
**CI for 'dev' branch**    
[![CI develop](https://github.com/Joker707/Vol_conv/blob/develop/.github/workflows/maven.yml/badge.svg?branch=develop)](https://github.com/Joker707/Vol_conv/blob/develop/.github/workflows/maven.yml)

This service allows you to convert some values to each other:
- bls (barrels)
- gal (gallons)
- l (litres)

You have 6 way to convert:
- bls -> gal
- bls -> l
- gal -> bls
- gal -> l
- l -> bls
- l -> gal

Also you can type 'stop' in the first input line to stop the converter!

## Docker

Build:
- ***docker build -t Vol_conv .***

Run:
- ***docker run -i Vol_conv***