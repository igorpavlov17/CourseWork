FROM node:12.7-alpine AS build
WORKDIR /usr/src/app
COPY ./package.json ./package-lock.json ./
RUN npm install
COPY . .
RUN npm run build

from nginx:1.20
COPY --from=build /usr/src/app/dist/from-to-education /usr/share/edu/nginx/html
