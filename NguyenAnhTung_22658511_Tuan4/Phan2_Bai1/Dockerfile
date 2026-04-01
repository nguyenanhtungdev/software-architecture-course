FROM node:18

# Tạo thư mục làm việc
WORKDIR /app

# Copy file vào container
COPY package.json .
COPY app.js .

# Expose cổng 3000
EXPOSE 3000

# Chạy app
CMD ["node", "app.js"]