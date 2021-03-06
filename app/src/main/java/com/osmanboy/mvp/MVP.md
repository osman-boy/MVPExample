Перейдем к выводам. Преимущества, которые нам удалось выявить для паттерна MVP, если посмотреть на
него со стороны выгоды внедрения в разработку:

Настоящее отделение логики представления от модели, в отличие, к примеру, от Apple MVC; Четкое
разделение ответственности между классами:
View — прорисовка, анимации, переходы между экранами; Presenter — форматирование, реакция на
события, логика представления и управление View; Model — работа с загрузкой данных по API,
извлечение данных из БД и их кэширование; Практически универсальная реализация интерфейсов
Model-View-Presenter-а на мобильных платформах для “обычных” проектов; Интеграционное тестирование
на уровне Presenter-а; Разделение задач в команде в рамках разработки одного экрана на задачи
представления (вместе с Presenter-ом) и модели; Возможность показа интерактивного демо заказчику,
без работающего бэкенда. При появлении реального сервиса мы не выбрасываем весь код, который
написали, а адаптируем API; Возможность эффективного привлечения непрофильного разработчика из
команды для написания кода на другой платформе; Расширение и добавление новых фич не вызовет эффекта
“чужого кода”, когда человек возвращается к разработке проекта после длительного перерыва из-за
набора простых правил размещения кода в строго определенных модулях.

MVP (Model-View-Presenter) — паттерн разработки пользовательского интерфейса. Шаблон MVP является
производным от MVC, но при этом имеет несколько иной подход. Основное отличие — представление (
presenter) не так сильно связано моделью (model).

Функциональные части MVP:

Model Модель представляет данные для отображения пользователю. View Вид реализует отображение
данных, представленных моделью, а также взаимодействует с представлением для обновлений. Presenter
Представление содержит основную бизнес-логику, так как взаимодействует со всеми частями модели.
Модель MVP Модель MVP
https://simpleone.ru/wp-content/uploads/2020/06/winword_9d87a4hiud.png