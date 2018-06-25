FROM node:carbon

# create the app directory for inside the Docker image
WORKDIR /usr/src/app

# install app dependencies from the package.json (and the package-lock.json)
COPY package*.json ./

RUN npm install

# bundle app source inside Docker image
COPY . .

# expose port 8080 to have it mapped by Docker daemon
EXPOSE 8080

# define the command to run the app (it's the npm start script from the package.json)
# npm start
CMD [ "npm", "start" ]