import express from 'express'
import swStats from 'swagger-stats'
const app = express();
app.use(swStats.getMiddleware());
app.get("/", (req, res) => {
    const object = {
        "message": "Hello World!"
    };
    res.status(200).json(object);
});
app.listen(3000, function() {
    console.log('Example app listening on port 3000!');
});