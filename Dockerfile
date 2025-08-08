FROM gradle:jdk24 as gradle

COPY ./ ./

RUN gradle installDist

FROM openjdk:24-slim

WORKDIR /bot

COPY --from=gradle /home/gradle/build/install/ktgbotapi-template/ ./

CMD ["./bin/ktgbotapi-template"]