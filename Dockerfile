FROM ubuntu:14.04
MAINTAINER Yu Qian <qianyuhit@hotmail.com>
RUN apt-get update && apt-get install -y ruby ruby-dev
RUN gem install bundler

