
```markdown
,--.         ,---.        ,--.  ,--.        ,--.
|  |,--,--, /  .-' ,---.  |  '--'  |,--.,--.|  |-.
|  ||      \|  `-,| .-. | |  .--.  ||  ||  || .-. '
|  ||  ||  ||  .-'' '-' ' |  |  |  |'  ''  '| `-' |
`--'`--''--'`--'   `---'  `--'  `--' `----'  `---'
```


# [Join the community on Discord](https://discord.gg/KnREfP4zz8)
___
# InfoHub

**InfoHub** is a web platform where users can create, manage, and share their own articles. Our goal is to provide a space for collaborative writing, allowing anyone to publish their knowledge, ideas, or stories. The platform also features a rating system to promote quality content.

## Features

- **Article Creation**: Users can easily create and publish their own articles.
- **User Profiles**: Each user has a customizable profile to showcase their articles.
- **Tags and Categories**: Articles can be tagged and categorized for easier navigation.
- **Community Interaction**: Users can rate, comment on, and share articles.
- **Rating System**: Articles are ranked based on user ratings to highlight the best content.
- **OAuth2 Login via Google**: Secure login and registration via Google OAuth2.
- **Responsive Design**: Optimized for both desktop and mobile devices.
- **Search and Filters**: Advanced search functionality allows users to find articles by keywords, tags, and categories.

## Tech Stack

- **Java**: 21
- **Spring Boot**: 3.3
- **Spring Security**: 6.3 (with Google OAuth2)
- **Database**: PostgreSQL
- **Build Tool**: Gradle Kotlin DSL

## Getting Started

### Prerequisites

To run the project locally, you need:

- Java 21
- Gradle 8.x (with Kotlin DSL)
- PostgreSQL

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/EchoMinds/InfoHub.git
   ```

2. Navigate to the project directory:

   ```bash
   cd InfoHub
   ```

3. Set up the PostgreSQL database. Create a database for the project, then update the `application.yaml.original` file with your database credentials:

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/infohub
       username: your_username
       password: your_password
   ```

4. Build and run the project using Gradle:

   ```bash
   ./gradlew clean build
   ./gradlew bootRun
   ```

5. (Optional) For OAuth2 setup, configure your Google API credentials in `application.yaml.original`:

   ```yaml
   spring:
     security:
       oauth2:
         client:
           registration:
             google:
               client-id: your_client_id
               client-secret: your_client_secret
   ```

---
## Usage

Once the application is running, visit:

```
http://localhost:8080
```

Create an account or log in with Google OAuth2 and start creating articles. Articles can be rated by other users, and the highest-rated articles will be featured prominently on the platform.

## Contributing

We welcome contributions!
If you would like to contribute to the project, please read [CONTRIBUTING.md](CONTRIBUTING.md).
Feel free to fork the repository, create a new branch, and submit a pull request. Please ensure your contributions adhere to our code standards.

## License

This project is licensed under the Apache License.

---
# InfoHub

**InfoHub** — это веб-платформа, где пользователи могут создавать, управлять и делиться своими статьями. Наша цель — предоставить пространство для совместного написания статей, где каждый может публиковать свои знания, идеи или истории. Платформа также включает систему рейтинга, которая помогает выделить качественный контент.

## Возможности

- **Создание статей**: Пользователи могут легко создавать и публиковать свои статьи.
- **Пользовательские профили**: У каждого пользователя есть настраиваемый профиль для отображения статей.
- **Теги и категории**: Статьи можно отмечать тегами и размещать в категориях для удобной навигации.
- **Взаимодействие с сообществом**: Пользователи могут оценивать, комментировать и делиться статьями.
- **Система рейтинга**: Статьи ранжируются по оценкам пользователей, чтобы выделить лучшие материалы.
- **OAuth2 вход через Google**: Безопасный вход и регистрация через Google OAuth2.
- **Адаптивный дизайн**: Платформа оптимизирована для работы как на компьютерах, так и на мобильных устройствах.
- **Поиск и фильтры**: Расширенный поиск позволяет находить статьи по ключевым словам, тегам и категориям.

## Технологический стек

- **Java**: 21
- **Spring Boot**: 3.3
- **Spring Security**: 6.3 (с OAuth2 через Google)
- **База данных**: PostgreSQL
- **Сборка**: Gradle Kotlin DSL

## Начало работы

### Необходимые компоненты

Для локального запуска проекта вам потребуется:

- Java 21
- Gradle 8.x (с Kotlin DSL)
- PostgreSQL

### Установка

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/EchoMinds/InfoHub.git
   ```

2. Перейдите в директорию проекта:

   ```bash
   cd InfoHub
   ```

3. Настройте базу данных PostgreSQL. Создайте базу данных и обновите файл `application.yaml.original`, добавив свои данные для подключения:

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/infohub
       username: ваше_имя_пользователя
       password: ваш_пароль
   ```

4. Соберите и запустите проект с помощью Gradle:

   ```bash
   ./gradlew clean build
   ./gradlew bootRun
   ```

5. (Опционально) Для настройки OAuth2 добавьте ваши данные от Google API в файл `application.yaml.original`:

   ```yaml
   spring:
     security:
       oauth2:
         client:
           registration:
             google:
               client-id: ваш_client_id
               client-secret: ваш_client_secret
   ```

---

## Использование

После запуска приложения откройте следующий адрес:

```
http://localhost:8080
```

Создайте аккаунт или войдите в систему с помощью Google OAuth2 и начните писать статьи. Другие пользователи могут оценивать статьи, и лучшие будут отображаться на видном месте.

## Вклад в проект

Мы рады любому вкладу!
Если вы хотите внести вклад в проект, пожалуйста, прочтите [CONTRIBUTING.md](CONTRIBUTING.md).
Делайте форк репозитория, создавайте новую ветку и отправляйте pull request. Убедитесь, что ваш код соответствует нашим стандартам.

## Лицензия

Проект лицензирован Apache лицензией.




