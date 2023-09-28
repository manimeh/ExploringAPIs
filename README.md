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

Example output of the Java code:
```java
News Article:
Title: Journal économique et financier
Text: Alors que les Etats-Unis envisagent de revenir sur l'assouplissement des contraintes bancaires, après la crise de liquidités des banques régionales américaines au printemps dernier, Londres propose de faire le chemin inverse. Le gouvernement vient en effet de présenter une série de propositions pour alléger le carcan réglementaire qui s'impose aux banques, dans le cadre des réformes post-Brexit. Le principe est clair : il s'agit de revoir une partie des règles de supervision du secteur financier, mises en place dans le sillage de la crise financière 2008. Lire aussiLes règles bancaires de « Bâle 3 » trouvent enfin un consensus en Europe C'est ce qu'avait fait l'administration Trump aux Etats-Unis en détricotant la fameuse loi bancaire Dodd-Franck, en relevant notamment le seuil de contrôle des banques par la banque centrale de 50 à 250 milliards d'actifs. Une mesure qui sera très critiquée par la suite lors de la faillite de Silicon Valley Bank et de Signature Bank en mars 2023. En Europe, la tendance est plutôt au renforcement des règles prudentielles avec la mise en place progressive de la réforme de Bâle 3 (ou Bâle 4) à partir de 2025. Consultation de place Un épisode qui n'a cependant pas ébranlé la conviction du gouvernement britannique d'assouplir les règles afin de redonner un peu de compétitivité et d'attrait à la City. Le ministère des Finances a donc lancé jeudi une consultation sur propositions, notamment celle qui consiste à supprimer, pour les banques de taille modeste, les règles de cloisonnement des activités de banque de détail et de banque d'investissement. Ces règles, entrées en vigueur seulement en 2019, visent à éviter les conflits d'intérêt et à protéger les ménages. Londres veut ainsi relever de 25 à 35 milliards de livres le seuil de dépôts de particuliers et PME détenus par une banque, pour qu'elle soit soumise aux règles de cloisonnement. Cette mesure est censée « supprimer un obstacle à la croissance » pour les petits établissements qui pourront plus facilement « élargir leur base de dépôts ». Autre proposition : la possibilité pour une banque de prendre des participations en direct dans les PME. Une mesure emblématique prévoit notamment d'assouplir les exigences en termes de fonds propres des compagnies d'assurances pour débloquer des dizaines de milliards de livres d'investissement. La Banque d'Angleterre (BoE) a lancé jeudi une consultation séparée sur le sujet. Il est également prévu d'assouplir les exigences de fonds propres des compagnies d'assurances pour débloquer en théorie des dizaines de milliards de livres d'investissement. La City en perte de vitesse Depuis plus d'un an, le gouvernement britannique multiplie les projets de réformes pour défendre la City de Londres depuis le Brexit face à la concurrence des autres places européennes. De manière certes symbolique, la City a même perdu la première place européenne en termes de capitalisation boursière au profit d'Euronext Paris. Depuis le Brexit, les banques américaines mais aussi les banques britanniques ont choisi de délocaliser une partie de leurs activités en Europe, largement au profit de la place de Paris, pour bénéficier du passeport européen. En 2022, selon une étude de E&Y, quelque 2.800 banquiers ont quitté Londres pour Paris. Même l'univers de la fintech fait grise mine alors que le Royaume-Uni était considéré comme le temple de l'innovation, avec le soutien du régulateur. En mai dernier, dans un entretien accordé à Bloomberg, le fondateur de la néo-banque britannique Monzo, Tom Blomfield, a très vertement critiqué la City avant son départ à San Francisco. Pour lui, le constat est clair : il y a désormais « plus d'opportunités pour les entrepreneurs aux Etats-Unis » et que le problème du listing au Royaume-Uni était très « réel ». « Je pense que cette ambition et cette conviction que l'on peut tout accomplir sont très, très puissantes et enivrantes, et qu'elles n'existent pas autant à Londres », avait-t-il ajouté. « No business friendly » La récente décision du géant britannique Arm de mener son introduction en Bourse à New York plutôt qu'à Londres n'a fait que confirmer les craintes de Tom Blomfield sur la perte de vitesse de la place britannique. De fait, le « Square Mile » est plongé depuis le Brexit dans le doute et l'introspection, alors même que les décideurs politiques et les autorités de place cherchent par tous les moyens à relancer la compétitivité de la place et à inciter les entreprises technologiques à venir se faire coter à Londres. Les commentaires de M. Blomfield s'inscrivent dans une période d'introspection dans le "Square Mile", les décideurs politiques et les fonctionnaires cherchant à relancer les marchés en difficulté de la City et à inciter davantage d'entreprises technologiques à s'introduire en Bourse à Londres. Les IPO à Londres ont en effet chuté plus fortement que la moyenne mondiale. Et heureusement que la fintech Wise a été l'une des rares fintech à se coter en juin 2021 à Londres plutôt qu'à New York. « Le Royaume-Uni n'est plus business friendly », a récemment confié à La Tribune un dirigeant d'une fintech britannique. « Les décisions sont irrationnelles et l'idée du modèle Brexit de relâcher toutes les contraintes pour devenir la Silicon Valley de la finance et de la tech en Europe ne fonctionne tout simplement pas », ajoute-t-il. Une déréglementation qui pose question Un certain de nombre d'assouplissements ont été mis en œuvre ces derniers mois pour tenter d'alléger les formalités administratives, notamment pour la cotation (listing), avec notamment la possibilité d'émettre des actions à droits de vote multiples pour permettre aux fondateurs de startup de conserver le contrôle. Reste que les obstacles du régulateur britannique au rachat d'Activision par Microsoft - une transaction à 75 milliards de dollars- ont beaucoup surpris alors que les autres autorités concernées en dehors du Royaume-Uni, notamment la Commission européenne pourtant tatillonne en matière de concurrence, avaient donné leur feu vert. Globalement, le projet du gouvernement est bien accueilli à la City et soulève de nombreuses critiques d'experts ou d'ONG, sans parler même de la commission parlementaire du Trésor. Alors que les banquiers centraux ne cessent d'alerter sur la montée des risques bancaires, ces opposants redoutent que le gouvernement n'aille trop loin dans la déréglementation et fasse peser sur les ménages des risques trop importants, comme en 2008 ou bien comme en 2023 aux Etats-Unis. La Banque d'Angleterre, qui s'est déjà inquiétée de la réforme du cadre prudentiel des assurances Solvabilité 2, pourrait à son tour monter au créneau. (Avec AFP)

Quiz:
{
  "questions": [
    {
      "query": "What is the purpose of the proposed measures by the UK government?",
      "choices": ["To tighten banking regulations", "To attract more businesses to London", "To prevent another financial crisis", "To increase the competitiveness of regional banks"],
      "answer": 1,
      "explanation": "The purpose of the proposed measures is to attract more businesses to London and increase the competitiveness of the city's financial sector."
    },
    {
      "query": "What is the main concern of the opponents to the government's deregulation plans?",
      "choices": ["The potential increase in banking risks", "The loss of competitiveness of regional banks", "The impact on the global financial market", "The lack of support for fintech companies"],
      "answer": 0,
      "explanation": "The opponents of the government's deregulation plans are concerned that it may lead to an increase in banking risks, similar to what happened in the US in 2008 and 2023."
    }
  ]
}
``` 


## Technical problems:
One of the major technical problems involves the ChatGPT API. The response to these API calls will be raw text which we will need to parse in order to feed it into the user interface.
Similarly, if we choose to use Wikipedia as one of the sources for the texts, we will need to filter out the HTML so that only raw text is fed into the user interface.
