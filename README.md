# ExploringAPIs

## Problem domain:
The app that our team chose to develop is a language learning game. This app presents to the user an article in a foreign language and creates a multiple choice quiz based on the article’s contents to test reading comprehension. This project aims to assist people with the process of learning a new language, specifically for learners who dislike using textbooks or non-interactive learning methods. 

We plan on ensuring that the app provides articles of varying reading difficulties to cater to learners with different proficiencies in the language they choose to learn. We also plan on having an interactive and user-friendly interface that is intuitive and easy to navigate. The app will also have multi-language support, with English being the language through which the quizzes are conducted.

## Description:
We plan to make use of several APIs in the development of this project. In particular, we plan on using an API to access news articles or wikipedia pages in foreign languages. In order to gauge the difficulty of the reading, we plan on using an API to calculate a numerical value of how readable the text is. In order to create the quiz, the text will be passed into a ChatGPT API, which will create multiple choice questions and assign each of them an answer.

Links to the API documentation:
- APIs for calculating reading difficulty:
  - https://readable.com/features/api/
  - https://api.seoreviewtools.com/documentation/readability-score-api/
- AI API (for quiz creation): https://nova-oss.com/
- Wikipedia API: https://en.wikipedia.org/api/rest_v1/
- World news fetcher (any language): https://worldnewsapi.com/

Example API calls:
![image](https://github.com/manimeh/ExploringAPIs/assets/64325373/ebdfbaa2-9aa2-44e8-ae15-f7dad164e580)
![image](https://github.com/manimeh/ExploringAPIs/assets/64325373/a8ef7f1e-337b-4a9b-863d-aee677f6a4ab)
![image](https://github.com/manimeh/ExploringAPIs/assets/64325373/54150984-c8d7-4cb0-bffc-aa5081b21c42)


## Technical problems:
One of the major technical problems involves the ChatGPT API. The response to these API calls will be raw text which we will need to parse in order to feed it into the user interface.
Similarly, if we choose to use Wikipedia as one of the sources for the texts, we will need to filter out the HTML so that only raw text is fed into the user interface.
